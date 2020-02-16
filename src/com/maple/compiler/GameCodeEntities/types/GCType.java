package com.maple.compiler.GameCodeEntities.types;

import com.maple.compiler.GameCodeEntities.types.classes.GCClass;

public class GCType {

    public enum Primitive {
        IntType,
        FloatType,
        BooleanType,
        StringType,
        ;
    }

    public enum ArrayType {
        IntArrayType,
        FloatArrayType,
        BooleanArrayType,
        StringArrayType,
        ClassArrayType,
        ArrayOfArrayType,
        ;
    }

    public GCClass typeClass;
    public Primitive typePrimitive;
    public ArrayType arrayType;

    public GCType(Primitive primitive) {
        this.typePrimitive = primitive;
        this.typeClass = null;
        this.arrayType = null;
    }

    public GCType(GCClass gcClass) {
        this.typeClass = gcClass;
        this.typePrimitive = null;
        this.arrayType = null;
    }

    public GCType(ArrayType arrayType) {
        this.arrayType = arrayType;
        this.typeClass = null;
        this.typePrimitive = null;
    }






}
