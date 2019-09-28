package com.gunner.example.maven;

import org.apache.maven.plugin.MojoExecutionException;

public interface VersionProvider {
	
	public String getVersion(String command) throws MojoExecutionException;

}
