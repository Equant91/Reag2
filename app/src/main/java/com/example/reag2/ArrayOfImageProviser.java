package com.example.reag2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayOfImageProviser {
    public static final int SITE_CONST = 100;
    public static final int ADVERTISEMENT_CONST = 101;
    public static final int SEO_CONST = 102;
    public static final int CONTACT_CONST = 103;

    static int numberOfArrey = CONTACT_CONST;

    private static final String ATTRIBUTE_NAME_IMAGE = "image";
    private static ArrayList<Map<String, Object>> data = new ArrayList<>(getArray().length);

    public static int[] getArray() {


        switch (numberOfArrey) {
            case SITE_CONST:
                int[] arrayImage = new int[]{R.drawable.pp1, R.drawable.pp1,R.drawable.pp1, R.drawable.pp1, R.drawable.pp1, R.drawable.pp1,R.drawable.pp1, R.drawable.pp1};
                return arrayImage;
            case ADVERTISEMENT_CONST:
                int[] arrayImage1 = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat1};
                return arrayImage1;
            case SEO_CONST:
                int[] arrayImage2 = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat1, R.drawable.cat2};
                return arrayImage2;
            case CONTACT_CONST:
                int[] arrayImage3 = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat1, R.drawable.cat2, R.drawable.cat2};
                return arrayImage3;
        }

        return null;
    }

    public static ArrayList<Map<String, Object>> getArrayList() {
        data.clear();
        Map<String, Object> m;
        for (int i = 0; i < getArray().length; i++) {
            m = new HashMap<String, Object>();
            m.put(ATTRIBUTE_NAME_IMAGE, getArray()[i]);
            data.add(m);
        }
        return data;
    }

}
