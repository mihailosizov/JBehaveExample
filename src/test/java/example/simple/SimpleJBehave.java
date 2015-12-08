package example.simple;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.failures.FailingUponPendingStep;

public class SimpleJBehave {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays.asList("example/example.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new ExampleSteps());
        embedder.runStoriesAsPaths(storyPaths);
    }

    public Configuration configuration() {
        return new MostUsefulConfiguration();
//                .usePendingStepStrategy(new FailingUponPendingStep());
//                // where to find the stories
//                .useStoryLoader(new LoadFromClasspath(this.getClass()))
//                        // CONSOLE and TXT reporting
//                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.STATS, Format.TXT));
    }
}