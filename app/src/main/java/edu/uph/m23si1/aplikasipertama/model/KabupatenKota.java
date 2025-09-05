package edu.uph.m23si1.aplikasipertama.model;

public class KabupatenKota {
    private String code;
    private String name;
    private String province_code; // relasi ke provinsi

    public KabupatenKota(String code, String name, String province_code) {
        this.code = code;
        this.name = name;
        this.province_code = province_code;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProvince_code() { return province_code; }
    public void setProvince_code(String province_code) { this.province_code = province_code; }
}

