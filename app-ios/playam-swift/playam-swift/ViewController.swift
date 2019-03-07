//
//  ViewController.swift
//  playam-swift
//
//  Created by Greg Rynkowski on 07/03/2019.
//  Copyright © 2019 Greg Rynkowski. All rights reserved.
//

import UIKit
import LibCommon

class ViewController: UIViewController, MainView {

    var presenter: MainPresenter = MainPresenterImpl()
    var label: UILabel?

    override func viewDidLoad() {
        super.viewDidLoad()

        let helloButton = UIButton(frame: CGRect(x: 100, y: 100, width: 100, height: 50))
        helloButton.backgroundColor = .green
        helloButton.setTitle("Send Hello", for: .normal)
        helloButton.addTarget(self, action: #selector(sayHalloAction), for: .touchUpInside)
        view.addSubview(helloButton)

        let infoButton = UIButton(frame: CGRect(x: 100, y: 200, width: 100, height: 50))
        infoButton.backgroundColor = .green
        infoButton.setTitle("Info", for: .normal)
        infoButton.addTarget(self, action: #selector(getInfoAction), for: .touchUpInside)
        view.addSubview(infoButton)

        label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 40))
        if (label != nil) {
            label!.center = CGPoint(x: 160, y: 285)
            label!.textAlignment = .center
            label!.font = label?.font.withSize(25)
            label!.text = "platform: " + PlatformKt.platformName()
            view.addSubview(label!)
        }
    }

    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
        presenter.attach(view: self)
        NSLog("viewDidAppear()")
    }

    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(animated)
        NSLog("viewDidDisappear()")
        presenter.detach()
    }

    func renderText(text: String) {
        NSLog("renderText()")
        label?.text = text
    }

    public func showPopup(text: String) {
        NSLog("showPopup()")
        let toastLabel = UILabel(frame: CGRect(
                x: self.view.frame.size.width/2 - 150,
                y: self.view.frame.size.height/2,
                width: 300,
                height: 35))
        toastLabel.backgroundColor = UIColor.black.withAlphaComponent(0.6)
        toastLabel.textColor = UIColor.white
        toastLabel.textAlignment = .center;
        toastLabel.font = UIFont(name: "Montserrat-Light", size: 12.0)
        toastLabel.text = text
        toastLabel.alpha = 1.0
        toastLabel.layer.cornerRadius = 10;
        toastLabel.clipsToBounds  =  true
        self.view.addSubview(toastLabel)
        UIView.animate(withDuration: 4.0, delay: 0.1, options: .curveEaseOut, animations: {
            toastLabel.alpha = 0.0
        }, completion: {(isCompleted) in
            toastLabel.removeFromSuperview()
        })
    }

    @objc
    func sayHalloAction(sender: UIButton!) {
        presenter.onHelloBtnClick()
    }

    @objc
    func getInfoAction(sender: UIButton!) {
        presenter.onInfoBtnClick()
    }
}
