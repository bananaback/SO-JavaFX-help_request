package dev.bananaback.controllers;

import dev.bananaback.SceneManager;

public abstract class BaseController {
    protected SceneManager sceneManager;

    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public abstract void styleSetup();
}
