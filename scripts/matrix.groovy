job('test') {
  authorization{
    permissions('rajas', [
            'hudson.model.Item.Configure',
            'hudson.model.Item.Discover',
            'hudson.model.Item.Delete'
        ])
  }
}
