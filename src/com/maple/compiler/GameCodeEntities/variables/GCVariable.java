package com.maple.compiler.GameCodeEntities.variables;

import com.maple.compiler.GameCodeEntities.AccessModifier;
import com.maple.compiler.GameCodeEntities.functions.GCFunction;
import com.maple.compiler.GameCodeEntities.pages.GCPage;
import com.maple.compiler.GameCodeEntities.types.GCType;
import com.maple.compiler.GameCodeEntities.types.classes.GCClass;

import java.util.List;

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
