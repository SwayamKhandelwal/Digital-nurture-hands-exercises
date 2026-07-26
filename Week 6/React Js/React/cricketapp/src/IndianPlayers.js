import React from 'react';

// Indian Team array for destructuring
export const IndianTeam = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

// Odd players extraction via array destructuring
export function OddPlayers([first, , third, , fifth]) {
    return (
        <ul>
            <li>First : {first}</li>
            <li>Third : {third}</li>
            <li>Fifth : {fifth}</li>
        </ul>
    );
}

// Even players extraction via array destructuring
export function EvenPlayers([, second, , fourth, , sixth]) {
    return (
        <ul>
            <li>Second : {second}</li>
            <li>Fourth : {fourth}</li>
            <li>Sixth : {sixth}</li>
        </ul>
    );
}

// ES6 Spread/Merge Feature
const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

// Component to display merged players list
export function ListofIndianPlayers({ IndianPlayers }) {
    return (
        <ul>
            {IndianPlayers.map((player, index) => (
                <li key={index}>Mr. {player}</li>
            ))}
        </ul>
    );
}