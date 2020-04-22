//
//  ContentView.swift
//  Planetary Manager
//
//  Created by Никита on 12.04.2020.
//  Copyright © 2020 Никита. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        TabView {
            MyPlanets()
                .tabItem{
                    Image(systemName: "person.circle.fill")
                    Text("My planets")
            }.tag(1)
        
            Resources()
                .tabItem{
                    Text("Resources")
                    Image(systemName: "person.circle.fill")
                    
            }.tag(2)
            
            Market()
                .tabItem{
                    Text("Market")
                    Image(systemName: "person.circle.fill")
                    
            }.tag(3)
            
            Profile()
                .tabItem{
                    Text("Profile")
                    Image(systemName: "person.circle.fill")
                    
            }.tag(4)
        }.accentColor(.red)
            .colorScheme(.dark)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
