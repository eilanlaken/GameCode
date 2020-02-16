package com.maple.compiler.gcentities.types.classes;

import com.maple.compiler.gcentities.functions.GCFunction;
import com.maple.compiler.gcentities.interfaces.GCInterface;
import com.maple.compiler.gcentities.libraries.GCLibrary;
import com.maple.compiler.gcentities.pages.GCPage;
import com.maple.compiler.gcentities.variables.GCVariable;

import java.util.List;

public class GCClass {

    public GCLibrary library;
    public GCPage page;

    public GCClass parent;
    public List<GCInterface> implementedInterfaces;
    public List<GCFunction> functions;
    public List<GCVariable> variables;




}
