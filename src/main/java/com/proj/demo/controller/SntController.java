package com.proj.demo.controller;

import com.proj.demo.model.Snt;
import com.proj.demo.service.SntService;
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
@RequestMapping("/snt")
public class SntController {
    private final SntService sntService;

    @Autowired
    public SntController(SntService sntService) {
        this.sntService = sntService;
    }

    @GetMapping()
    public String getSnt(Model model,
                         @RequestParam("page") Optional<Integer> page,
                         @RequestParam("size") Optional<Integer> size) {

        int currentPage = page.orElse(1);
        int pageSize = size.orElse(30);

        Page<Snt> bookPage = sntService.findPaginated(PageRequest.of(currentPage - 1,
                pageSize));
        model.addAttribute("snt", bookPage);

        int totalPages = bookPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        model.addAttribute("sntAttribute", new Snt());
        return "snthome";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveEdit(Snt snt) {
        sntService.updateSnt(snt);
        return "redirect:/snt";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSnt(Snt snt) {
        sntService.addSnt(snt);
        return "redirect:/snt";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable(value = "id") Integer id) {
        sntService.deleteSnt(id);
        return "redirect:/snt";
    }

}
