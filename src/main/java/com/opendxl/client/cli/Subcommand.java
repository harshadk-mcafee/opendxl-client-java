/*---------------------------------------------------------------------------*
 * Copyright (c) 2018 McAfee, LLC - All Rights Reserved.                     *
 *---------------------------------------------------------------------------*/

package com.opendxl.client.cli;

import picocli.CommandLine;

/**
 * Subcommand abstract class for all CLI subcommands
 */
abstract class Subcommand {

    @CommandLine.Option(names = "--verbose",    description = "Verbose mode. Increases the log level to DEBUG")
    private boolean verbose;

    /**
     * Execution entry point for the subcommand. This method is called when the name of the implementing subcommand
     * is entered in the CLI arguments.
     *
     * @param parseResult The input CLI arguments
     */
    void execute(CommandLine.ParseResult parseResult) {
        // Do nothing
    }

    /**
     * Method to return if the verbose flag was set or not
     *
     * @return Whether the verbose flag was set or not
     */
    boolean isVerbose() {
        return this.verbose;
    }
}
