package example.junit;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave extends JUnitStories{

      public SimpleJBehave() {
        super();
        this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
    }

    protected List<String> storyPaths() {
        return Arrays.asList("example/example.story");
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration();
    }

}