package com.hustmedia.controllers;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hustmedia.models.Major;
import com.hustmedia.services.MajorService;

import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

@Controller
public class majorController {

    @Autowired
    private MajorService majorService;

    @RequestMapping("/list")
    public String  list(ModelMap model) {
        List<Major> list =  majorService.findAll();
        model.addAttribute("major", list);
        return "list";
    }
    @GetMapping("/add")
    public String add(HttpServletRequest request, Major major, ModelMap model){
        major.setName(request.getParameter("name"));
        majorService.save(major);
        return "redirect:list";
    }
    
    @GetMapping("/update/{id}")
    public String update(Major major, 
                         @PathVariable(name = "id") Integer id, 
                         ModelMap model, 
                         HttpServletRequest request){
        major.setName(request.getParameter("name"));
        majorService.save(major);
        return list(model);
    }

    @GetMapping("/delete/{id}")
    public String deleteData(Major major, @PathVariable(name = "id") Integer id, ModelMap model){
        majorService.deleteById(id);
        return list(model);
    }
}
