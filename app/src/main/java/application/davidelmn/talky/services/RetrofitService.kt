package application.davidelmn.talky.services

import application.davidelmn.talky.BuildConfig
import application.davidelmn.talky.models.Contact
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by davide-syn on 9/4/17.
 */
interface RetrofitService {

    @GET("users")
    fun users(): Observable<List<Contact>>

    companion object {
        fun init(): RetrofitService {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BuildConfig.GTIHUB_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit.create(RetrofitService::class.java)
        }
    }
}