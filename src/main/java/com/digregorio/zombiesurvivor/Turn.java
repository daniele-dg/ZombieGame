package com.digregorio.zombiesurvivor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Turn {
    private Action[] actions = new Action[3];
}
