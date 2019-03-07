//
//  ViewController.swift
//  playam-swift
//
//  Created by Greg Rynkowski on 07/03/2019.
//  Copyright © 2019 Greg Rynkowski. All rights reserved.
//

import UIKit
import LibCommon

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = PlatformKt.platformName()
        view.addSubview(label)
    }
}
