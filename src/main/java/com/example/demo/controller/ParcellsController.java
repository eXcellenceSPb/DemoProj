package com.example.demo.controller;

import com.example.demo.model.Parcells;
import com.example.demo.model.Snt;
import com.example.demo.model.Users;
import com.example.demo.service.ParcellsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/parcells")
public class ParcellsController {
    private final ParcellsService parcellsService;

    @Autowired
    public ParcellsController(ParcellsService parcellsService) {
        this.parcellsService = parcellsService;
    }

    @GetMapping()
    public String getParcels(Model model,
                         @RequestParam("page") Optional<Integer> page,
                         @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(15);

        Page<Parcells> bookPage = parcellsService.findPaginated(PageRequest.of(currentPage - 1,
                pageSize));
        model.addAttribute("parcells", bookPage);

        int totalPages = bookPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("parcellAttribute", new Parcells());
        return "parcells";
    }

    @RequestMapping(value = "/addParcel", method = RequestMethod.POST)
    public String addParcel(Parcells parcel) {
        parcellsService.addParcells(parcel);
        return "redirect:/parcells";
    }

    @RequestMapping(value = "/byUser/{id}", method = RequestMethod.GET)
    public String getByUser(Model model,
                            @PathVariable(value = "id") Integer id){
        List<Parcells> parcels = parcellsService.findByUser(id);
        model.addAttribute("parcells",parcels);
        return "parcells";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteParcel(@PathVariable(value = "id") Integer id) {
        parcellsService.deleteParcel(id);
        return "redirect:/parcells";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String updateParcel(Parcells parcel) {
        parcellsService.updateParcel(parcel);
        return "redirect:/parcells";
    }

}
