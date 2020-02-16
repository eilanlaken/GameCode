package com.maple.compiler.gcentities.functions;

import com.maple.compiler.gcentities.AccessModifier;
import com.maple.compiler.gcentities.types.GCType;

public class GCFunction {

    public AccessModifier accessModifier;
    public boolean isAtomic;
    public boolean isMeta;

    public String name;
    public GCType returnType; // null for "nothing"


}
