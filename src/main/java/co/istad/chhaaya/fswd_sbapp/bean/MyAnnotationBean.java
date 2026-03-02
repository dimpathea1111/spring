package bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Repository
//@Controller
//@Scope("prototype")
@Component
@Getter
@Setter
@NoArgsConstructor

public class MyAnnotationBean {
    String name;

}
