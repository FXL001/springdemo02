package com.fx.ctronller;

import com.fx.entity.Student;
import com.fx.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020-2021</p>
 *
 * @author LiuFeiFan
 * @version 1.0
 * @date 2021-08-01 16:55
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",studentRepository.findAll());
        return modelAndView;
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
        return "redirect:/hello/index";
    }
    @PostMapping("/save")
    public String save(Student student){
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }
    @PostMapping("/update")
    public String update(Student student){
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }

  @GetMapping("/findById/{id}")
  public ModelAndView findById(@PathVariable("id") long id) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("update");
    modelAndView.addObject("student", studentRepository.findById(id));
    return modelAndView;
        }
//        测试页面
@GetMapping("/index2")
public String index2(){
    System.out.println("index...............");
    return "index2";
}
}
