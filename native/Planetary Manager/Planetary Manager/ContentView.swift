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
        Text(CommonKt.getPlatformNameValue())
            .font(.system(size: 26))
        .bold()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
