package com.james.bootstrap.controller;

import com.james.bootstrap.entity.Category;
import com.james.bootstrap.entity.Product;
import com.james.bootstrap.service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class ProductController {
private static final Log logger= LogFactory.getLog(ProductController.class);

@Autowired
private ProductService productService;

@RequestMapping("/input_product")
public String inputProduct(Model model){

    List<Category> categories=productService.getAllCategories();
    model.addAttribute("categories",categories);
    model.addAttribute("product",new Product());
    return "ProductAddForm";

}
@RequestMapping("/save_product")
public String saveProduct(Model model, @ModelAttribute Product product, HttpServletRequest servletRequest){

    logger.info("saveProduct method is called");
    logger.info(product.toString());
    List<MultipartFile> files=product.getImages();
    Category category=productService.getCategory(product.getCategory().getId());
    product.setCategory(category);
    if(null!=files&&files.size()>0){
        for(MultipartFile imagefile:files){
            String filename=imagefile.getOriginalFilename();
            File file=new File(servletRequest.getServletContext().getRealPath("/WEB-INF/image"),filename);
            try{

                imagefile.transferTo(file);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    model.addAttribute("product",product);
    return "ProductDetails";
}

}
