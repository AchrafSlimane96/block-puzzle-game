# Block Puzzle Game

A classic block puzzle game built in Java using Swing.

## Game Description

Block Puzzle is a strategic puzzle game where players place falling blocks on a grid. Complete full rows to clear them and earn points. The game ends when no more blocks can be placed.

## Features

- **6x6 Grid**: Classic puzzle board layout
- **Tetromino Blocks**: 7 different block shapes (I, O, S, Z, J, L, T)
- **Line Clearing**: Complete rows disappear and earn bonus points
- **Score System**: Earn 10 points per block placement, 50 bonus points per cleared line
- **Next Block Preview**: See the next block coming
- **Game Over Detection**: Game ends when no valid moves remain
- **Restart Option**: Press R to restart the game

## How to Play

1. **Click on the grid** to place the current block
2. **Complete full rows** to clear them and earn points
3. **Plan your moves** - think strategically about block placement
4. **Survive as long as possible** - the game ends when you can't place any more blocks
5. **Press R** to restart when game is over

## Controls

- **Mouse Click**: Place block on grid
- **R Key**: Restart the game

## Project Structure

```
src/main/java/com/blockpuzzle/
├── Main.java           # Entry point
├── GameWindow.java     # Main window setup
├── GamePanel.java      # Main game loop and rendering
├── GameBoard.java      # Grid management and line clearing
├── Block.java          # Tetromino block definitions
├── BlockManager.java   # Block generation and preview
└── Score.java          # Score tracking
```

## Building and Running

### Compile with Maven
```bash
mvn clean compile
```

### Run with Maven
```bash
mvn exec:java -Dexec.mainClass="com.blockpuzzle.Main"
```

### Build JAR
```bash
mvn clean package
java -jar target/block-puzzle-game-1.0.0.jar
```

## Future Enhancements

- [ ] Sound effects
- [ ] Different difficulty levels
- [ ] Leaderboard system
- [ ] Rotation mechanics for blocks
- [ ] Power-ups and special blocks
- [ ] Particle effects for cleared lines
- [ ] Mobile touch support

## License

This project is open source and available under the MIT License.
