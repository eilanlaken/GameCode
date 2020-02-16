package com.maple.compiler.GameCodeEntities.classes;

import com.maple.compiler.GameCodeEntities.functions.GCFunction;
import com.maple.compiler.GameCodeEntities.interfaces.GCInterface;
import com.maple.compiler.GameCodeEntities.libraries.GCLibrary;
import com.maple.compiler.GameCodeEntities.pages.GCPage;
import com.maple.compiler.GameCodeEntities.variables.GCVariable;

import java.util.List;

public class GCClass {

    public GCLibrary library;
    public GCPage page;

    public String name;
    public GCClass parent;
    public List<GCInterface> implementedInterfaces;
    public List<GCFunction> functions;
    public List<GCVariable> variables;



}
