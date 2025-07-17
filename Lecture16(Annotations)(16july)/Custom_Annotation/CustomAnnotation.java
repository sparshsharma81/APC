package Custom_Annotation;

@interface SmartPhone
{
	String calling();
	int version();
}


@SmartPhone(calling = "Hello", version = 2)
public class CustomAnnotation {
	
	int model;

	public CustomAnnotation(int model) {
		super();
		this.model = model;
	}

}