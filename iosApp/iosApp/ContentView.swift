import UIKit
import SwiftUI
import ComposeApp

struct ComposeView: UIViewControllerRepresentable {
    let viewController: () -> UIViewController
    func makeUIViewController(context: Context) -> UIViewController {
        return viewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        TabView {
            ComposeView(viewController: HomeViewControllerKt.homeViewController)
                .ignoresSafeArea()
                .tabItem {
                    Label("Home", systemImage: "house.fill")
                }
            ComposeView(viewController: SettingsViewControllerKt.settingsViewController)
                .ignoresSafeArea()
                .tabItem {
                    Label("Settings", systemImage: "gear")
                }
        }
    }
}
