package lk.NIBM.PizzaShopCreed.controller;

import lk.NIBM.PizzaShopCreed.dao.Product;
import lk.NIBM.PizzaShopCreed.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("pizzas")
    public String showHome() {
        return "pizzas";
    }

    @GetMapping("/pizzas")
    public String showProductPage(Model model) {
        List<Product> listProduct = productService.listAll();
        model.addAttribute("listProduct", listProduct);
        System.out.println("Get / ");
        return "pizzas";
    }

    @GetMapping("/new_pizza")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "new_pizza";
    }

    @RequestMapping(value = "/saves", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product std) {
        productService.saveProducts(std);
        return "redirect:pizzas";
    }

    @RequestMapping("/edits/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("new_pizza");
        Product std = productService.get(id);
        mav.addObject("product", std);
        return mav;
    }

    @RequestMapping("/deletes/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id) {
        productService.deleteProducts(id);
        return "pizzas";
    }
}
