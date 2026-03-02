package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyBeanController {

//    1. declear dependency
    private final  MyAnnotationBean bean;//required dependency
    private MyAnnotationBean bean2;//Option dependency

//    2. inject dependency (Contructor-base)
    public  MyBeanController(MyAnnotationBean bean){
        this.bean=bean;
//        this.bean=new MyAnnotationBean();
    }

//    3. Inject dependency (setter-based)
    @Autowired
    public void setBean2(MyAnnotationBean bean2){
        this.bean2=bean2;
    }


    @GetMapping("/bean")
    public List<MyAnnotationBean> getBean(){
        System.out.println("Bean :"+bean);
        System.out.println("Bean2 :"+bean2);
        bean.name="lakna";
       bean2.name="Jenoy";
        return List.of(bean,bean2);
    }


//    public MyAnnotationBean getBean(){
//
//        bean.name="Bean 1";
//        return null;
//
//    }

}
