package rs.ac.ni.pmf.web.demo_rest.model;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Note {
    long id;
    String title;
    String content;

}
