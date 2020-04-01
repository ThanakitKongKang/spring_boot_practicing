
package com.summerproj.entity;

import com.github.alperkurtul.firebaserealtimedatabase.annotation.FirebaseUserAuthKey;

import java.math.BigDecimal;
import com.github.alperkurtul.firebaserealtimedatabase.annotation.FirebaseDocumentId;
import com.github.alperkurtul.firebaserealtimedatabase.annotation.FirebaseDocumentPath;

@FirebaseDocumentPath("/product")
public class Product {

    @FirebaseUserAuthKey
    private String authKey;

    @FirebaseDocumentId
    private String firebaseId;

    private String id;
    private String name;
    private BigDecimal price;

}