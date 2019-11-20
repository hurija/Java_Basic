package lombok;

// model java beans


//@ToString             // dodaje metodę toString()
//@Setter               // dodaje settery do wszystkich pól
//@Getter               // dodaje gettery do wszystkich pól
//@NoArgsConstructor     //  konstruktor domyślny - bez argumentów
@AllArgsConstructor      // dodaje konstruktor z wszystkimi polami klasowymi w argumencie
@Data                    // dodaje gettery i settery i toString do wszystkich pół klasowych
public class AnnotationsLombok {
    private  String login;
    private  String password;
    private String acronim;

}
