package edu.knoldus;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "test", threadSafe = true)
public class Hello extends AbstractMojo {

    @Parameter(property = "test.message", required = true)
    public String message;

    public void execute() throws MojoExecutionException {
        System.out.println("Hello "+ message);
    }

}