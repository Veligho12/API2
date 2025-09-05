package edu.uph.m23si1.aplikasipertama.api;

import edu.uph.m23si1.aplikasipertama.api.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/provinces.json")
    Call<ApiResponse> getProvinces();


//    @GET("api/regencies/{province_code}.json")
//    Call<RegenciesResponse> getRegencies(@Path("province_code") String provinceCode);

    @GET("api/regencies/{province_code}.json")
    Call<RegenciesResponse> getRegencies(@Path("province_code") String provinceCode);
}
