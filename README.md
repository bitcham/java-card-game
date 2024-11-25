# Card Game 🎮
A simple Java card game implementation where two players compete against each other by drawing cards from a deck and comparing their hand values.

## Game Rules 🃏
### Cards
- Each card has a number (1-13) and one of four suits: ♠️ (Spade), ♥️ (Heart), ♦️ (Diamond), ♣️ (Clover)
- Total number of cards: 52 (13 numbers × 4 suits)

### Gameplay
1. The deck is shuffled randomly at the start of each game
2. Each player draws 5 cards from the deck
3. Players' hands are shown in sorted order:
  - Cards are primarily sorted by number (ascending)
  - Cards with the same number are sorted by suit (♠️ > ♥️ > ♦️ > ♣️)
4. The player with the higher sum of card numbers wins 🏆
  - In case of equal sums, the game is a draw

## Structure
### Classes 
- `Card`: Represents a single card with number and suit
- `Deck`: Contains 52 cards and handles shuffling
- `Player`: Manages player's hand and calculates score
- `CardGameMain`: Main game loop and game logic

### Key Features 🃏
- Object-oriented design
- Card shuffling implementation
- Sorting algorithm for player hands
- Score calculation system
- Interactive console interface

## How to Play
1. Run the `CardGameMain` class
2. Press any key to start a new game (or 'n' to exit)
3. Watch as players draw their cards
4. See the sorted hands of both players
5. The winner is announced based on hand values 🏆
6. Choose to play again or exit

## Technical Implementation ⚙️
- Uses Java Collections Framework for deck management
- Implements Comparable interface for card sorting
- Utilizes Enum for card suits
- Employs Object-Oriented Programming principles
