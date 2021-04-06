# snyk-test-data
Test data for Snyk

Proof of concept for scanning a repo with Snyk from a GitHub workflow.
This repo has several branches, each branch represents one build ecosystem.
Every branch uses the same [workflow](.github/workflows/run-snyk.yml).

| Branch        | Alert examples  |
| --- | --- | 
| maven | [link](https://github.com/pierre-ernst/snyk-test-data/security/code-scanning?query=tool%3A%22Snyk+Open+Source%22+ref%3Arefs%2Fheads%2Fmaven) |
| gradle (Groovy DSL) | [link](https://github.com/pierre-ernst/snyk-test-data/security/code-scanning?query=tool%3A%22Snyk+Open+Source%22+ref%3Arefs%2Fheads%2Fgradle) |
| gradle (Kotlin DSL) | [link](https://github.com/pierre-ernst/snyk-test-data/security/code-scanning?query=tool%3A%22Snyk+Open+Source%22+ref%3Arefs%2Fheads%2Fgradle-kts) |
| phyton | [link](https://github.com/pierre-ernst/snyk-test-data/security/code-scanning?query=tool%3A%22Snyk+Open+Source%22+ref%3Arefs%2Fheads%2Fpython) |
