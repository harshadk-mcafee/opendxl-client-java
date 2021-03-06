/*---------------------------------------------------------------------------*
 * Copyright (c) 2018 McAfee, LLC - All Rights Reserved.                     *
 *---------------------------------------------------------------------------*/

package com.opendxl.client.cli;

import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * The CLI arguments related to cryptography
 */
class CryptoArgs {

    /**
     * The file prefix used on CSR, key, and cert files
     */
    @CommandLine.Option(names = {"-f", "--file-prefix"}, paramLabel = "PREFIX",
            description = "file prefix to use for CSR, key, and cert files. (default: client)", defaultValue = "client")
    private String filePrefix;

    /**
     * The Subject Alternative Names to be added to a CSR
     */
    @CommandLine.Option(names = {"-s", "--san"}, paramLabel = "NAME",
            description = "add Subject Alternative Name(s) to the CSR", arity = "0..*")
    private List<String> subjectAlternativeNames;

    /**
     * The passphrase to use for the private key
     */
    @CommandLine.Option(names = {"-P", "--passphrase"}, paramLabel = "PASS", description = "private key passphrase",
            interactive = true)
    private String passphrase;

    /**
     * The country to use in a CSR's Subject DN
     */
    @CommandLine.Option(names = "--country", paramLabel = "COUNTRY",
            description = "Country (C) to use in the CSR's Subject DN")
    private String country;

    /**
     * The State or province (ST) to use in a CSR's Subject DN
     */
    @CommandLine.Option(names = "--state-or-province", paramLabel = "STATE",
            description = "State or province (ST) to use in the CSR's Subject DN")
    private String stateOrProvince;

    /**
     * Locality (L) to use in a CSR's Subject DN
     */
    @CommandLine.Option(names = "--locality", paramLabel = "LOCALITY",
            description = "Locality (L) to use in the CSR's Subject DN")
    private String locality;

    /**
     * Organization (O) to use in a CSR's Subject DN
     */
    @CommandLine.Option(names = "--organization", paramLabel = "ORG",
            description = "Organization (O) to use in the CSR's Subject DN")
    private String organization;

    /**
     * Organizational Unit (OU) to use in a CSR's Subject DN
     */
    @CommandLine.Option(names = "--organizational-unit", paramLabel = "ORG_UNIT",
            description = "Organizational Unit (OU) to use in the CSR's Subject DN")
    private String organizationalUnit;

    /**
     * e-mail address to use in the CSR's Subject DN
     */
    @CommandLine.Option(names = "--email-address", paramLabel = "EMAIL",
            description = "e-mail address to use in the CSR's Subject DN")
    private String email;

    /**
     * Get the full private key file name including configuration directory and file prefix
     *
     * @param configDir The configuration directory
     * @return The full private key file name including configuration directory and file prefix
     */
    String getPrivateKeyFileName(String configDir) {
        return configDir + File.separatorChar + this.filePrefix + ".key";
    }

    /**
     * Get the full CSR file name including configuration directory and file prefix
     *
     * @param configDir The configuration directory
     * @return The full CSR file name including configuration directory and file prefix
     */
    String getCsrFileName(String configDir) {
        return configDir + File.separatorChar + this.filePrefix + ".csr";
    }

    /**
     * Get the full certificate file name including configuration directory and file prefix
     *
     * @param configDir The configuration directory
     * @return The full certificate file name including configuration directory and file prefix
     */
    String getCertFileName(String configDir) {
        return configDir + File.separatorChar + this.filePrefix + ".crt";
    }

    /**
     * Get the Subject Alternative Names to be added to a CSR
     *
     * @return The Subject Alternative Names to be added to a CSR
     */
    List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * Set the Subject Alternative Names to be added to a CSR
     *
     * @param subjectAlternativeNames The Subject Alternative Names to be added to a CSR
     */
    void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    /**
     * Get the file prefix used on CSR, key, and cert files
     *
     * @return The file prefix used on CSR, key, and cert files
     */
    String getFilePrefix() {
        return filePrefix;
    }

    /**
     * Set the file prefix used on CSR, key, and cert files
     *
     * @param filePrefix The file prefix used on CSR, key, and cert files
     */
    void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    /**
     * Get the passphrase to use for the private key
     *
     * @return The passphrase to use for the private key
     */
    String getPassphrase() {
        return passphrase;
    }

    /**
     * Set the passphrase to use for the private key
     *
     * @param passphrase The passphrase to use for the private key
     */
    void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    /**
     * Get the country to use in a CSR's Subject DN
     *
     * @return The country to use in a CSR's Subject DN
     */
    String getCountry() {
        return country;
    }

    /**
     * Set the country to use in a CSR's Subject DN
     *
     * @param country The country to use in a CSR's Subject DN
     */
    void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get the State or province (ST) to use in a CSR's Subject DN
     *
     * @return The State or province (ST) to use in a CSR's Subject DN
     */
    String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Set the State or province (ST) to use in a CSR's Subject DN
     *
     * @param stateOrProvince The State or province (ST) to use in a CSR's Subject DN
     */
    void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * Get the Locality (L) to use in a CSR's Subject DN
     *
     * @return The Locality (L) to use in a CSR's Subject DN
     */
    String getLocality() {
        return locality;
    }

    /**
     * Set the Locality (L) to use in a CSR's Subject DN
     *
     * @param locality The Locality (L) to use in a CSR's Subject DN
     */
    void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * The Organization (O) to use in a CSR's Subject DN
     *
     * @return The Organization (O) to use in a CSR's Subject DN
     */
    String getOrganization() {
        return organization;
    }

    /**
     * Set the Organization (O) to use in a CSR's Subject DN
     *
     * @param organization The organization (O) to use in a CSR's Subject DN
     */
    void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Get the Organizational Unit (OU) to use in a CSR's Subject DN
     *
     * @return The Organizational Unit (OU) to use in a CSR's Subject DN
     */
    String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * Set the Organizational Unit (OU) to use in a CSR's Subject DN
     *
     * @param organizationalUnit The Organizational Unit (OU) to use in a CSR's Subject DN
     */
    void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * Get the e-mail address to use in the CSR's Subject DN
     *
     * @return The e-mail address to use in the CSR's Subject DN
     */
    String getEmail() {
        return email;
    }

    /**
     * Set the e-mail address to use in the CSR's Subject DN
     *
     * @param email The e-mail address to use in the CSR's Subject DN
     */
    void setEmail(String email) {
        this.email = email;
    }
}
