




@Controller
public class HomeController {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/")
public String index(Model model){
        //First let's create an actor
        Actor actor = new Actor();


    }

}