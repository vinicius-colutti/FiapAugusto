package com.fiap.gabrieltesta.web;

import com.fiap.gabrieltesta.model.Company;;
import com.fiap.gabrieltesta.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping({"/companies"})
    public String companies(Model model) {
        model.addAttribute("companies", companyService.list());
        return "companies";
    }

    @GetMapping({"/create-company"})
    public String create_company(Model model) {
        model.addAttribute("companyForm", new Company());
        return "create-company";
    }

    @PostMapping("/create-company")
    public String create_company(@ModelAttribute("companyForm") Company companyForm, BindingResult bindingResult) {
        companyService.save(companyForm);
        return "redirect:/companies";
    }

    @GetMapping("/update-company/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("company", companyService.findById(id));
        return "update-company";
    }

    @PostMapping("/update-company/{id}")
    public String updateCompany(@PathVariable("id") long id, @ModelAttribute("companyForm") Company companyForm, BindingResult result) {
        companyForm.setId(id);
        companyService.update(companyForm);
        return "redirect:/companies";
    }

    @GetMapping("/delete-company/{id}")
    public String deleteCompany(@PathVariable("id") long id) {
        companyService.delete(id);
        return "redirect:/companies";
    }

}
