package com.maple.compiler.gcentities.variables;

import com.maple.compiler.gcentities.AccessModifier;
import com.maple.compiler.gcentities.functions.GCFunction;
import com.maple.compiler.gcentities.pages.GCPage;
import com.maple.compiler.gcentities.types.GCType;
import com.maple.compiler.gcentities.types.classes.GCClass;

public class GCVariable {

    public AccessModifier accessModifier;
    public GCClass definedForClass;
    public GCFunction definedInFunction;
    public GCPage definedInPage;

    public GCType gcType;
    public boolean isMeta;
    public boolean isConstant;
    public boolean isFuzzy;


}
