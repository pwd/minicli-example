package com.jedou.examples.cli;

import org.apache.commons.cli.CommandLine;

import com.jedou.common.cli.Commander;
import com.jedou.common.cli.annonation.Option;
import com.jedou.common.cli.annonation.Options;

/**
 * Created by tiankai on 14-10-10.
 */
@Options({
        @Option(value = "c", longOpt = "clang", description = "C Language"),
        @Option(value = "j", longOpt = "java", description = "Java Language"),
        @Option(value = "p", longOpt = "python", description = "Python Language"),
        @Option(value = "r", longOpt = "ruby", description = "Ruby Language"),
})
@Option(longOpt = "javascript", hasArg = false, description = "JavaScript Language")
public class ExampleCommander implements Commander {
    @Override
    public void execute(CommandLine commandLine) {
        if (commandLine.hasOption('c'))
            System.out.println("do opt c.");
        else if (commandLine.hasOption('j'))
            System.out.println("do opt j.");
        System.out.println("do nothing or done.");
    }

    @Override
    public String getUsage() {
        return "Example Commander";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }
}
