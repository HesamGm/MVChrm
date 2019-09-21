package j2os.controller;

import j2os.model.entity.Employee;
import j2os.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/hire.do")
    public String hire(@ModelAttribute Employee employee, HttpServletRequest request){
        long l = Long.parseLong(request.getParameter("departmentId"));
        employeeService.add(employee, l);
        return "redirect:/employee/select.do";
    }
    @RequestMapping("/edit.do")
    public String edit(@ModelAttribute Employee employee){
        employeeService.update(employee);
        return "redirect:/employee/select.do";
    }
    @RequestMapping("/remove.do")
    public String remove(HttpServletRequest request){
        long l = Long.parseLong(request.getParameter("employee-id"));
        employeeService.remove(l);
        return "redirect:/employee/select.do";
    }
    @RequestMapping("/select.do")
    @ResponseBody
    public Object findAll(){
        return employeeService.select();
    }
}
