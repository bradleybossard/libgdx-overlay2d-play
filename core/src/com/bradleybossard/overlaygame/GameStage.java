package com.bradleybossard.overlaygame;

import com.uwsoft.editor.renderer.Overlap2DStage;

/**
 * Created by bradleybossard on 11/2/14.
 */
public class GameStage extends Overlap2DStage {
    public GameStage() {

        // This will create SceneLoader instance and configure all things like default resource manager, physics e.t.c
        initSceneLoader();

        // This will load MainScene data from json and make Actors from it
        sceneLoader.loadScene("MainScene");

        // Get the root actor and add it to stage
        addActor(sceneLoader.getRoot());
    }
}
