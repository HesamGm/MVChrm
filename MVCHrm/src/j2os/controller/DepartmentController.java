package j2os.controller;

import j2os.model.entity.Department;
import j2os.model.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/create.do")
    public String create(@ModelAttribute Department department){
    departmentService.create(department);
        return "redirect:/department/select.do";
    }
    @RequestMapping("/edit.do")
    public String update(@ModelAttribute Department department){
        return "/select.do";
    }

    @RequestMapping("/delete.do")
    public String delete(HttpServletRequest request){
        long l = Long.parseLong(request.getParameter("departmentId"));
        departmentService.remove(l);
        return "/select.do";
    }
        @RequestMapping("/select.do")
        @ResponseBody
        public Object select(){
        return departmentService.findAll();
        }

}
