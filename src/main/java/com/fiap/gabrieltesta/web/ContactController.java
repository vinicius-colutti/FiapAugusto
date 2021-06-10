package com.fiap.gabrieltesta.web;

import com.fiap.gabrieltesta.model.Contact;
import com.fiap.gabrieltesta.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping({"/contact"})
    public String contact(Model model) {
        model.addAttribute("contactForm", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String create_contact(@ModelAttribute("contactForm") Contact contactForm, BindingResult bindingResult) {
        contactService.save(contactForm);
        return "redirect:/companies";
    }

}
