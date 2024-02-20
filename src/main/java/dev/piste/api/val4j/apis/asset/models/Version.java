package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class Version {

    @SerializedName("manifestId")
    private String manifestID;
    @SerializedName("branch")
    private String branch;
    @SerializedName("version")
    private String version;
    @SerializedName("buildVersion")
    private String buildVersion;
    @SerializedName("engineVersion")
    private String engineVersion;
    @SerializedName("riotClientVersion")
    private String riotClientVersion;
    @SerializedName("riotClientBuild")
    private String riotClientBuild;
    @SerializedName("buildDate")
    private String buildDateAsString;

    public String getManifestID() {
        return manifestID;
    }

    public String getBranch() {
        return branch;
    }

    public String getVersion() {
        return version;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public String getRiotClientVersion() {
        return riotClientVersion;
    }

    public String getRiotClientBuild() {
        return riotClientBuild;
    }

    public LocalDateTime getBuildDateTime() {
        return LocalDateTime.parse(buildDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }
}