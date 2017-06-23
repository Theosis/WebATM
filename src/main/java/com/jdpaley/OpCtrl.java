package com.jdpaley;

//import java.util.ArrayList;
//import java.util.Collection;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jdp on 6/23/17.
 */
@Controller
public class OpCtrl {
    @Autowired
    private OpRepo opRepo;
    
    /**
     * This creates a new choice object for the empty form and stuffs it into
     * the model
     */
    @ModelAttribute("WebData")
    public MyOwnWebDataObjectNoFreakinRepoInvolved supplyWebData() {
    	MyOwnWebDataObjectNoFreakinRepoInvolved wdo = new MyOwnWebDataObjectNoFreakinRepoInvolved();
//    	wdo.setAcct(0);
//    	wdo.setAct("");
      return wdo;
    }

    @GetMapping(path="/")
    public String webOp(Model m)
            {
                Op op = new Op();
                m.addAttribute("op", op);
                //System.out.println(m);
                return "index";
            }
 	
    @PostMapping(path="/")
    public String getWebAct(Model m)
    	{   	
    	
    	/*m.addAttribute("WebData", wdo);
    	String choice = wdo.getAct();*/
		System.out.println(m);
		
		//opRepo.save(op);
		return "done";
		}
    
    /*    @PostMapping(path="/")
    public String doOp(@ModelAttribute("op") Op op, BindingResult bindingResult, Model m)
    	{   	
    	String choice = m.getValue("op");
    	
    	m.addAttribute("op", op);
		opRepo.save(op);
		return "done";
		}*/
	
}
