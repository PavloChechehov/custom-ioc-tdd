package com.jeeconf.testing.typed;

import com.jeeconf.annotations.JEEConfComponent;
import com.jeeconf.annotations.JEEConfComponentType;

@JEEConfComponent
@JEEConfComponentType(Visitor.class)
public class Speaker implements Visitor  {
}
