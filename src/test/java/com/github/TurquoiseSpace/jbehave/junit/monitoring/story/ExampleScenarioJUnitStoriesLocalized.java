package com.github.TurquoiseSpace.jbehave.junit.monitoring.story;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import com.github.TurquoiseSpace.jbehave.junit.monitoring.JUnitReportingRunner;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.parsers.RegexStoryParser;
import org.junit.runner.RunWith;

@RunWith(JUnitReportingRunner.class)
public class ExampleScenarioJUnitStoriesLocalized extends ExampleScenarioJUnitStories
{

	@Override
	public Configuration configuration() {
		LocalizedKeywords keywords = new LocalizedKeywords(Locale.GERMAN);
		Configuration configuration = super.configuration();
		RegexStoryParser storyParser = new RegexStoryParser(keywords, configuration.storyLoader(),
				configuration.tableTransformers());
		return configuration
				.useKeywords(keywords)
				.useStoryParser(storyParser);
	}

	@Override
	protected List<String> storyPaths() {
		return Collections.singletonList("com/github/valfirst/jbehave/junit/monitoring/story/Multiplication_de.story");
	}
}
