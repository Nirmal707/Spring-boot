package com.kgfsl;

import java.util.*;
public interface DetailService
{
public List<Demo> getAll();
public Demo save(Demo dt);
public void delete(Long id);
public Demo find(Long id);

}