package com.witch.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.witch.Dto.Response;
import com.witch.Model.Person;

@Service
public class PersonService {

    @SuppressWarnings("unchecked")
    public Response<Object> calculateAverageVictims(Person personA, Person personB) {


        Response<Object> res = new Response<>();
        HashMap map = new HashMap<>();
        
        int yearOfPersonA = personA.getYearOfBirth(); // 2
        int yearOfPersonB = personB.getYearOfBirth(); // 4

        if (yearOfPersonA < 0 || yearOfPersonB < 0) {
            res.setStatus(HttpStatus.BAD_REQUEST.toString());
            res.setMessage("error");
            res.setPayload(-1);
            return res;
        }

        int kematianA = hitungDeret(yearOfPersonA);
        int kematianB = hitungDeret(yearOfPersonB);
        System.out.println(kematianA);
        System.out.println(kematianB);
        
        map.put("average", (double) (kematianA + kematianB) / 2);
        map.put("personA_tahunKe", yearOfPersonA);
        map.put("personA_jumlahKematian", kematianA);
        map.put("personB_tahunKe", yearOfPersonB);
        map.put("personB_jumlahKematian", kematianB);
        res.setStatus(HttpStatus.OK.toString());
        res.setMessage("success");
        res.setPayload(map);
        return res;

        


    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static ArrayList<Integer> buatDeret(int panjangDeret) {
        ArrayList<Integer> tempDeret = new ArrayList<>();
        
        for (int i = 1; i <= panjangDeret; i++) {
            int value = fibonacci(i);
            tempDeret.add(value);
        }
        
        return tempDeret;
    }
    public static int hitungDeret(int panjangDeret) {
        ArrayList<Integer> deret = buatDeret(panjangDeret);
        int sum = 0;
        for (int num : deret) {
            sum += num;
        }
        return sum;
    }
}

