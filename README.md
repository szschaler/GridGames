# GridGames
A DSL for developing grid-based arcade-style games. Because, .... fun!

Depends on latest Xtext and Sirius.

Install from update site here: https://szschaler.github.io/GridGames/updatesite

Then import the sample projects to explore.

In the Minesweeper project you can now also explore a visualisation of the cell states. You can do this for other example projects, too, but for the Minesweeper example it's already set up. To do this:

1. In the minesweeper example project, find the `.aird` file in the `src` folder and double click on it.
2. In the editor that opens, double click on the `new GlobalCellStateSpecDiagram` in the middle list
![image](https://user-images.githubusercontent.com/7057319/204872203-0b07060f-11f5-4608-b6ae-4dbe0e542ec5.png)
3. This opens a diagrammatic representation of the cell state specification in `minesweeper.ggame`. Edits to the states and transitions in the `.ggame` file will be reflected in the diagram on every save. In principal, edits in the other direction are also possible, but I haven't spent too much time making sure that all layouting is preserved.
![image](https://user-images.githubusercontent.com/7057319/204872576-fba338ed-c3eb-4e01-bb29-94689052d47e.png)
