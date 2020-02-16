package com.maple.compiler.GameCodeEntities.functions;

import com.maple.compiler.GameCodeEntities.AccessModifier;
import com.maple.compiler.GameCodeEntities.types.GCType;

import java.util.ArrayList;
import java.util.Map;

public class GCFunction {

    public AccessModifier accessModifier;
    public boolean isAtomic;
    public boolean isMeta;

    public String name;
    public GCType returnType; // null for "nothing"


}
